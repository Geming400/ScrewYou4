package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugStructureInfo.class)
public class DebugStructureInfo_415075270Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__493550999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-493550999L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1185498794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1185498794L))
            info.setReturnValue("wB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_972427360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972427360L))
            info.setReturnValue(-1472988502);
    }

    @Inject(at = @At("HEAD"), method = "boundingBox()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void boundingBox__1390004522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390004522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pieces()Ljava/util/List;", cancellable = true)
    private void pieces_1507195066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1507195066L))
            info.setReturnValue(null);
    }


}
