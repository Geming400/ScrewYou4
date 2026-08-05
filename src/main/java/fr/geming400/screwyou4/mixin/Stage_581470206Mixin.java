package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.progress.LevelLoadListener.Stage.class)
public class Stage_581470206Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;", cancellable = true)
    private static void values__1012725593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012725593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/level/progress/LevelLoadListener$Stage;", cancellable = true)
    private static void valueOf__70161590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70161590L))
            info.setReturnValue(net.minecraft.server.level.progress.LevelLoadListener.Stage.START_SERVER);
    }


}
