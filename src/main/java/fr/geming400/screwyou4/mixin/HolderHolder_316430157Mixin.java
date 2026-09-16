package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunctions.HolderHolder.class)
public class HolderHolder_316430157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__592196112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592196112L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1086853681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086853681L))
            info.setReturnValue("B\uC005,]U\uA3CFg\u3F53\u8AA3tDjW\uBAF9s\uA999\u7098\u2184G\u2749ZbJ$ciTqoeU9t\u9CBD,x(L\u99F1;4!KrD>\u2EAC90.jp>'bDLlI}?p\u04CBqX\u6B76T@V-T\u4EA27I;/eIO)q%V*;v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_873782247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873782247L))
            info.setReturnValue(-1976153136);
    }

    @Inject(at = @At("HEAD"), method = "compute(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)D", cancellable = true)
    private void compute_1248219769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1248219769L))
            info.setReturnValue(5.482623007587924E8D);
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/core/Holder;", cancellable = true)
    private void function_677798000(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677798000L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxValue()D", cancellable = true)
    private void maxValue_1134353440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134353440L))
            info.setReturnValue(5.482623006537534E8D);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private void codec__1647834674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647834674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillArray([DLnet/minecraft/world/level/levelgen/DensityFunction$ContextProvider;)V", cancellable = true)
    private void fillArray_887069676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887069676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "minValue()D", cancellable = true)
    private void minValue__1338307698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338307698L))
            info.setReturnValue(5.482623000703177E8D);
    }

    @Inject(at = @At("HEAD"), method = "mapChildren(Lnet/minecraft/world/level/levelgen/DensityFunction$Visitor;)Lnet/minecraft/world/level/levelgen/DensityFunction;", cancellable = true)
    private void mapChildren__242877328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-242877328L))
            info.setReturnValue(null);
    }


}
