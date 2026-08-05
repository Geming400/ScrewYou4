package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.IsCarried.class)
public class IsCarried332769602Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__1948146180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948146180L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_2068623326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068623326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1718281861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1718281861L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__802690373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802690373L))
            info.setReturnValue("Y&'g=!_A<_cSa>Gs95go kwjN[VA\u1113lE\u88D5x\u8704\u72BCeAg,@p\u6DD9:)\uBE04g\u33E4b$nN%NLD\u4E63:mJlTDmXs:ZJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_371032344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371032344L))
            info.setReturnValue(-599792536);
    }


}
