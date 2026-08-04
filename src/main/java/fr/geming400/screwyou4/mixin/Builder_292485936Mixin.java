package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.flag.FeatureFlagRegistry.Builder.class)
public class Builder_292485936Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/flag/FeatureFlag;", cancellable = true)
    private void create__1818929435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818929435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/flag/FeatureFlagRegistry;", cancellable = true)
    private void build_1783716848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1783716848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVanilla(Ljava/lang/String;)Lnet/minecraft/world/flag/FeatureFlag;", cancellable = true)
    private void createVanilla_2097758371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2097758371L))
            info.setReturnValue(null);
    }


}
