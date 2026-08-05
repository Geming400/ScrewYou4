package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.PackOutput.Target.class)
public class Target691785029Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/data/PackOutput$Target;", cancellable = true)
    private static void values__1583224168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583224168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/data/PackOutput$Target;", cancellable = true)
    private static void valueOf_460282079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(460282079L))
            info.setReturnValue(net.minecraft.data.PackOutput.Target.RESOURCE_PACK);
    }


}
