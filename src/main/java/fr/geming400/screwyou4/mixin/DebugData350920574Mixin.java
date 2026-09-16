package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.Path.DebugData.class)
public class DebugData350920574Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__557705694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557705694L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1121344099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121344099L))
            info.setReturnValue("@H]T\u42ACXDb8m0LRT6Ke@ihXUBo,d1%** -S\u5903VQ\u5475ZX!`v_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_908272665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908272665L))
            info.setReturnValue(-127744838);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write__1078066084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1078066084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/world/level/pathfinder/Path$DebugData;", cancellable = true)
    private static void read_1077458422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077458422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetNodes()Ljava/util/Set;", cancellable = true)
    private void targetNodes_285268480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285268480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openSet()[Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void openSet_1033681527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033681527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "closedSet()[Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void closedSet__861691883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861691883L))
            info.setReturnValue(null);
    }


}
