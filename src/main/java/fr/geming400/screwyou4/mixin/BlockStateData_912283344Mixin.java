package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.BlockStateData.class)
public class BlockStateData_912283344Mixin {
        @Inject(at = @At("HEAD"), method = "getTag(I)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void getTag__2104060629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104060629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeBlockStateTag(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void upgradeBlockStateTag__1475566074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475566074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "upgradeBlock(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void upgradeBlock_2125025414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125025414L))
            info.setReturnValue("\u77C0jbQKB^T\u0810.\"w\uFFCA\u4015l{a.}b| (\u3DE9Pn8&g\uC734\uBD75,f;.");
    }

    @Inject(at = @At("HEAD"), method = "upgradeBlock(I)Ljava/lang/String;", cancellable = true)
    private static void upgradeBlock__508585993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508585993L))
            info.setReturnValue("]8Cs\uC6FE<E0\u4F30{?@(np/W\u6768n\"QP;g&k3E\uFEB3R<W!,;Q\u7D7E(\uBEEEvd\u18BAf\uA0512s}`rAu)N\uD19EuZim[GsKgy30oiebRGOwE\u08D2ZZ03'/K'\u9844i+d\u8EDEJ|siI");
    }


}
