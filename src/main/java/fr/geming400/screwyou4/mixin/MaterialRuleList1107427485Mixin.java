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
            info.setReturnValue("W9%;,{uXXPt<,I\uD19Ep\u6B2D`7N%\uADE3zcM#zdpL/N\uD672N8;i'l\u3228%*ih|C*[i\u444EY7z`9C<\u4086xTfVMvA\"=r\uBE75Z/\u63CFF0Y`W\u1BE9WMD&4IP\u3F85`}YE\u8E1C\u3B74$0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1145690227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145690227L))
            info.setReturnValue(1394536942);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/level/levelgen/DensityFunction$FunctionContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void calculate__1252080504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1252080504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "materialRuleList()[Lnet/minecraft/world/level/levelgen/NoiseChunk$BlockStateFiller;", cancellable = true)
    private void materialRuleList_87971974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87971974L))
            info.setReturnValue(null);
    }


}
