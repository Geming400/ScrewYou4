package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.class)
public class ChunkPalettedStorageFix1728616482Mixin {
        @Inject(at = @At("HEAD"), method = "getName(Lcom/mojang/serialization/Dynamic;)Ljava/lang/String;", cancellable = true)
    private static void getName__2121727963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121727963L))
            info.setReturnValue("JO=Jkk^.H:LvH|%>{|^qa\u831Fbh F1Z\u4080s9\u7714Vq");
    }

    @Inject(at = @At("HEAD"), method = "getProperty(Lcom/mojang/serialization/Dynamic;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getProperty__2090230565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090230565L))
            info.setReturnValue("\uF958l\u5416qH?\u156Ba[");
    }

    @Inject(at = @At("HEAD"), method = "idFor(Lnet/minecraft/util/CrudeIncrementalIntIdentityHashBiMap;Lcom/mojang/serialization/Dynamic;)I", cancellable = true)
    private static void idFor__297475377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-297475377L))
            info.setReturnValue(-1914474689);
    }

    @Inject(at = @At("HEAD"), method = "getSideMask(ZZZZ)I", cancellable = true)
    private static void getSideMask_1316036992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316036992L))
            info.setReturnValue(827599741);
    }

    @Inject(at = @At("HEAD"), method = "makeRule()Lcom/mojang/datafixers/TypeRewriteRule;", cancellable = true)
    private void makeRule__1081154979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081154979L))
            info.setReturnValue(null);
    }


}
