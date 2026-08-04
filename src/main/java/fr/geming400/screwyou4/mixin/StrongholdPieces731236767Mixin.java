package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.StrongholdPieces.class)
public class StrongholdPieces731236767Mixin {
        @Inject(at = @At("HEAD"), method = "resetPieces()V", cancellable = true)
    private static void resetPieces_769511754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769511754L))
            info.cancel();
    }


}
