package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.material.MaterialRuleList.class)
public class MaterialRuleList1107427485Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_198801217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(198801217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1877851010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877851010L))
            info.setReturnValue("e\uA923r8/i)W9?g8\u9B2FzJc2\uC2C8?'f}ebEF<R5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1664779576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664779576L))
            info.setReturnValue(487497530);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void calculate__2076218258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076218258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialRuleList()[Lnet/minecraft/world/level/levelgen/NoiseChunk$BlockStateFiller;", cancellable = true)
    private void materialRuleList_1005922597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1005922597L))
            info.setReturnValue(null);
    }


}
