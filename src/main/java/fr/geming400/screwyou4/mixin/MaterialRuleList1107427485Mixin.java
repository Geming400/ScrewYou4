package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.material.MaterialRuleList.class)
public class MaterialRuleList1107427485Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1802027552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802027552L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__28032490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28032490L))
            info.setReturnValue("W9%;,{uXXPt<,I톞p欭`7N%귣zcM#zdpL/N홲N8;i'l㈨%*ih|C*[i䑎Y7z`9C<䂆xTfVMvA\"=r빵Z/描F0Y`WᯩWMD&4IP㾅`}YE踜㭴$0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1145690227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145690227L))
            info.setReturnValue(697230042);
    }

    @Inject(at = @At("HEAD"), method = "materialRuleList()[Lnet/minecraft/world/level/levelgen/NoiseChunk$BlockStateFiller;", cancellable = true)
    private void materialRuleList_87971974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87971974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void calculate__1252080504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252080504L))
            info.setReturnValue(null);
    }


}
