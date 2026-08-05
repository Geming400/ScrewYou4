package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.ForbiddenSymlinkInfo.class)
public class ForbiddenSymlinkInfo_2008420750Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__901034288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901034288L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Ljava/nio/file/Path;", cancellable = true)
    private void target_874057067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874057067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_872960774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872960774L))
            info.setReturnValue("\u5805u!,\u3F1CX('?gg.Hpi}5ff\u1AA0U2lY@oa>qsQ!\uBFA01B\u8A28\u301AIK\"l\u2175+6-0WS;yyv[\"1 U*}t?&?V.iQwfy`v!(%@p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2046683491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046683491L))
            info.setReturnValue(1390707525);
    }

    @Inject(at = @At("HEAD"), method = "link()Ljava/nio/file/Path;", cancellable = true)
    private void link_874057067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874057067L))
            info.setReturnValue(null);
    }


}
