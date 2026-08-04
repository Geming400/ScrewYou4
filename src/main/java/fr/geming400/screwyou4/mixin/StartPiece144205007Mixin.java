package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.StrongholdPieces.StartPiece.class)
public class StartPiece144205007Mixin {
        @Inject(at = @At("HEAD"), method = "getLocatorPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getLocatorPosition__1749181872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1749181872L))
            info.setReturnValue(null);
    }


}
