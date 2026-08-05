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
            info.setReturnValue("M틒n閆TD$`첵ꠕxPv庂3O<_bYi殹u䓧R>``麭3%=l#x羸씆`$㗓SK,Z$_㿔(/` Q;>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2043086379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043086379L))
            info.setReturnValue(-1594956211);
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
