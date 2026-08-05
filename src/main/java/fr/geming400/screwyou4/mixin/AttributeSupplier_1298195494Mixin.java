package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeSupplier.class)
public class AttributeSupplier_1298195494Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getValue__1127054640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127054640L))
            info.setReturnValue(1.0549910058767171E8D);
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void builder__951700365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-951700365L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "createInstance(Ljava/util/function/Consumer;Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;", cancellable = true)
    private void createInstance_2093861466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2093861466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getBaseValue_2003531135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2003531135L))
            info.setReturnValue(1.0549910082263455E8D);
    }

    @Inject(at = @At("HEAD"), method = "getModifierValue(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)D", cancellable = true)
    private void getModifierValue__1887744191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887744191L))
            info.setReturnValue(1.0549910092680526E8D);
    }

    @Inject(at = @At("HEAD"), method = "hasModifier(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void hasModifier__1399655996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1399655996L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasAttribute(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void hasAttribute__1930705203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930705203L))
            info.setReturnValue(false);
    }


}
