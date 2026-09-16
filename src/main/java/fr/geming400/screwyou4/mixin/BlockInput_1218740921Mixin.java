package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockInput.class)
public class BlockInput_1218740921Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__1218805724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218805724L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void test__1906455055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1906455055L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__518230791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-518230791L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState_224910145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224910145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void place_1127952446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127952446L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/Set;", cancellable = true)
    private void getDefinedProperties_2105907124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2105907124L))
            info.setReturnValue(null);
    }


}
