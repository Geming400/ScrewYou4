package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.BundleFullness.class)
public class BundleFullness_123360032Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__1365437209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365437209L))
            info.setReturnValue(3.602569E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1271890623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1271890623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__785266237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-785266237L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_893783556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(893783556L))
            info.setReturnValue("SE=RaHA\"%CU5dcw\uCF4C%Jh)I5r\uA27C @!q-\u89C71lP@,\u61B07O4v\u621C^n*\u4A78`SP4![A{P`]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_680712122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(680712122L))
            info.setReturnValue(406441530);
    }


}
