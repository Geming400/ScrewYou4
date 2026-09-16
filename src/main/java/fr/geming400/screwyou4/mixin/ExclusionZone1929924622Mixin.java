package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.placement.StructurePlacement.ExclusionZone.class)
public class ExclusionZone1929924622Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1021298354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021298354L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1594619149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594619149L))
            info.setReturnValue(")HQ@3f^9\"p\uF9817\uABB1=,r 2dOeS\u3D12\u64DA:F||v9#PV<]z3\uF996nEMU\u8CB5=\uB893{v9Y\uC799*]&r\uFD48QX|Q9V`{@8U?pE4^)<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1807690583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807690583L))
            info.setReturnValue(1035453741);
    }

    @Inject(at = @At("HEAD"), method = "chunkCount()I", cancellable = true)
    private void chunkCount__1228947310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228947310L))
            info.setReturnValue(994293012);
    }

    @Inject(at = @At("HEAD"), method = "otherSet()Lnet/minecraft/core/Holder;", cancellable = true)
    private void otherSet__484460904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-484460904L))
            info.setReturnValue(null);
    }


}
