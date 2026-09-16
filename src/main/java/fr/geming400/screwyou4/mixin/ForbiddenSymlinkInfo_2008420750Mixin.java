package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.ForbiddenSymlinkInfo.class)
public class ForbiddenSymlinkInfo_2008420750Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1099794481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099794481L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Ljava/nio/file/Path;", cancellable = true)
    private void target_384834556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384834556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1516123022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516123022L))
            info.setReturnValue("'\u4030\uCAE1!\u6A54\u2A7E\u8673\u6A6EF\uD62F[L?@sEHw4c_hbk]\uBD79]xrI6(\uFCD7_&e\u0ECDUxn\"Hxs\uD2D5vSTD0.ActcP?)`Z\u40C3I?FVDX\uAAB7\u30E2\uFF26n+QX4PhtC\u76EE\u9F0D>\"0Iiwf{DoB3p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1729194456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729194456L))
            info.setReturnValue(-1068553857);
    }

    @Inject(at = @At("HEAD"), method = "link()Ljava/nio/file/Path;", cancellable = true)
    private void link_1511649125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511649125L))
            info.setReturnValue(null);
    }


}
