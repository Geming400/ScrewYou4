package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.UseCycle.class)
public class UseCycle266191607Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__1222605633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222605633L))
            info.setReturnValue(9.44631E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1129059047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129059047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__642434661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-642434661L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1036615132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036615132L))
            info.setReturnValue("A43\"D97[U^f(w\u5AA1ClkE09tW;SPAQ^b\uFBE2g`\uD05Fr=g&0SnXf<v\u6148-7iZ\u5A12!B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_823543698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823543698L))
            info.setReturnValue(1307820334);
    }

    @Inject(at = @At("HEAD"), method = "period()F", cancellable = true)
    private void period__746944391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-746944391L))
            info.setReturnValue(9.44631E8F);
    }


}
