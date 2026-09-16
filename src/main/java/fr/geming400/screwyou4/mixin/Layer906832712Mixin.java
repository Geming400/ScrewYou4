package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration.Layer.class)
public class Layer906832712Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1793556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1793556L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1677256237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677256237L))
            info.setReturnValue("\u34168 [{E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1464184803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1464184803L))
            info.setReturnValue(1270932601);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void state_1522696916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522696916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void height__66056118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66056118L))
            info.setReturnValue(null);
    }


}
