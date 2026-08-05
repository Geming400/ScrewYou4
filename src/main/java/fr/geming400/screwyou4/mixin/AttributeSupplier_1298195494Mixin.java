package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeSupplier.class)
public class AttributeSupplier_1298195494Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getValue__1450313963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450313963L))
            info.setReturnValue(9.292048005893586E8D);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void builder_597977048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597977048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInstance(Ljava/util/function/Consumer;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;", cancellable = true)
    private void createInstance__1796686935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1796686935L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAttribute(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void hasAttribute__1450292821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450292821L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBaseValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getBaseValue__1450313963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450313963L))
            info.setReturnValue(9.292048005893586E8D);
    }

    @Inject(at = @At("HEAD"), method = "hasModifier(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void hasModifier__1364497741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364497741L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getModifierValue(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)D", cancellable = true)
    private void getModifierValue__1364518883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364518883L))
            info.setReturnValue(9.292048009051235E8D);
    }


}
