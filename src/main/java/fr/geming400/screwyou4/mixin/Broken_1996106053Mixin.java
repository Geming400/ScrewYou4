package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.Broken.class)
public class Broken_1996106053Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__284809730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284809730L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__563007520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-563007520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__913348985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913348985L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_860646077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860646077L))
            info.setReturnValue("J[:\u1165t\u4CF7\uCA509Lz)6TC2|>D52xqHe0Uc\u736B,Y\u5262a\u9843J$8yMqU1 <64(,,\u25C3B&I6is[e8gH\u1FF4E|'UY:.u(YLz{AWQjU?zJ\u9F03w:N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2034368794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2034368794L))
            info.setReturnValue(-175236383);
    }


}
