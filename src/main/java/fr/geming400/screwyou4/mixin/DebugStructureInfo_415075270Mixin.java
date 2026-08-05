package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugStructureInfo.class)
public class DebugStructureInfo_415075270Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1800587528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1800587528L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__720384706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720384706L))
            info.setReturnValue("\u0964-B.(:&nal00.R E2/[\"x5qzj\u49A8{gE7,]v\u2F00eF\u2623,^\u530BJ)cU>`^:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_453338011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(453338011L))
            info.setReturnValue(-639590487);
    }

    @Inject(at = @At("HEAD"), method = "boundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void boundingBox_585223055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585223055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pieces()Ljava/util/List;", cancellable = true)
    private void pieces_2041412085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041412085L))
            info.setReturnValue(null);
    }


}
