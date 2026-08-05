package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.worldgen.TrialChambersStructurePools.class)
public class TrialChambersStructurePools2031586785Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_1476981068(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1476981068L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawner(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void spawner__356840192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356840192L))
            info.setReturnValue("rgo^l\u7070w70swv\u370F7>1=xW,dQ\u37FE\uAD2A-R\u3ED67+g!Oc>i(68\u28F4!;A:&\u2C80L\uD60F'5qc-r8[ZhP5Zm^)bg/fsTopz7jz')x;E]");
    }


}
