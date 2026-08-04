package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Timelines.class)
public class Timelines1892222604Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1017232433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1017232433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_756762629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756762629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1930485346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930485346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__817553866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-817553866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void setup_1528476685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1528476685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__925214164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-925214164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;)V", cancellable = true)
    private void teardown_977930563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(977930563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__666890968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666890968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timelines()Ljava/util/List;", cancellable = true)
    private void timelines__776407876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776407876L))
            info.setReturnValue(null);
    }


}
