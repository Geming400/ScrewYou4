package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.BlockBreakingRenderState.class)
public class BlockBreakingRenderState2062886895Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__846568142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846568142L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_927426920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927426920L))
            info.setReturnValue(",!\u98FB\u38BFa\uA9DFUU -[(;W\u0FB8\"f71%(\u4DB3)\"W=JbbA/CDeT8S:?]oHK2Ko)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2101149637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101149637L))
            info.setReturnValue(853827919);
    }

    @Inject(at = @At("HEAD"), method = "progress()I", cancellable = true)
    private void progress_2101149141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101149141L))
            info.setReturnValue(1056975339);
    }

    @Inject(at = @At("HEAD"), method = "blockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void blockPos_169500016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169500016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void blockState__232871971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232871971L))
            info.setReturnValue(null);
    }


}
