package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.blocks.BlockInput.class)
public class BlockInput_1218740921Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__168502766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168502766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void test__1466961853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466961853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1690585653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1690585653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getState__1077017946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077017946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void place_1191144357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191144357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefinedProperties()Ljava/util/Set;", cancellable = true)
    private void getDefinedProperties__610294566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-610294566L))
            info.setReturnValue(null);
    }


}
