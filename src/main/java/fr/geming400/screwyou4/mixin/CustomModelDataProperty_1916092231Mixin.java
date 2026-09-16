package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.CustomModelDataProperty.class)
public class CustomModelDataProperty_1916092231Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index__1684758630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684758630L))
            info.setReturnValue(-378933673);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get_427294990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427294990L))
            info.setReturnValue(7.177817E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_520841576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520841576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1007465962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007465962L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1608451541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1608451541L))
            info.setReturnValue("S#s)\uBDC5K\u08297se,v5s\u63DCB/Ru`w-\u8452(MWfxMjO1PJ\u4619xP\u21A8\u94C9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1821522975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821522975L))
            info.setReturnValue(928483212);
    }


}
