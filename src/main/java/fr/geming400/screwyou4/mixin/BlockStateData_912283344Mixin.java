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

    @Inject(at = @At("HEAD"), method = "upgradeBlock(I)Ljava/lang/String;", cancellable = true)
    private static void upgradeBlock__508585993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508585993L))
            info.setReturnValue("]8Cs웾<E0估{?@(np/W杨n\"QP;g&k3EﺳR<W!,;Q絾(뻮vdᢺfꁑ2s}`rAu)N톞uZim[GsKgy30oiebRGOwE࣒ZZ03'/K'顄i+d軞J|siI");
    }

    @Inject(at = @At("HEAD"), method = "upgradeBlock(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void upgradeBlock_2125025414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125025414L))
            info.setReturnValue("矀jbQKB^Tࠐ.\"wￊ䀕l{a.}b| (㷩Pn8&g윴뵵,f;.");
    }


}
