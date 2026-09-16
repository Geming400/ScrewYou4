package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ChunkAccess.PackedTicks.class)
public class PackedTicks2004823637Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1096197369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096197369L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1519720134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519720134L))
            info.setReturnValue("U!=1Eo\uA983a> \u674A\u90A2Nw'bak1f1\u2BAC\"=7-HIw\u5BB47'{4}c[E.\u634Aj-Ly;|6?f\uB004\u179FHAb}7MYvVt4V]k}U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1732791568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732791568L))
            info.setReturnValue(-1524902168);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/List;", cancellable = true)
    private void blocks_712502027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(712502027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluids()Ljava/util/List;", cancellable = true)
    private void fluids_694685166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(694685166L))
            info.setReturnValue(null);
    }


}
