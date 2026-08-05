package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.ChunkAccess.PackedTicks.class)
public class PackedTicks2004823637Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__904631400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904631400L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_869363662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869363662L))
            info.setReturnValue("M\uD2D2n\u9586TD$`\uCCB5\uA815xPv\u5E823O<_bYi\u6BB9u\u44E7R>``\u9EAD3%=l#x\u7FB8\uC506`$\u35D3SK,Z$_\u3FD4(/` Q;>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2043086379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043086379L))
            info.setReturnValue(-706316111);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/List;", cancellable = true)
    private void blocks__663806843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663806843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fluids()Ljava/util/List;", cancellable = true)
    private void fluids__663806843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663806843L))
            info.setReturnValue(null);
    }


}
