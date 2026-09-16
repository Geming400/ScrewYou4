package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerLinks.class)
public class ServerLinks561917304Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__346708964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346708964L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1332340829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1332340829L))
            info.setReturnValue("GD|o. g-Q{+>;Ngp`\u3F776`L>_\u2285\u1D76{-%`)i");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1119269395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119269395L))
            info.setReturnValue(1181652935);
    }

    @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1621033676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621033676L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_858830904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(858830904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findKnownType(Lnet/minecraft/server/ServerLinks$KnownLinkType;)Ljava/util/Optional;", cancellable = true)
    private void findKnownType_1098082508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098082508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "untrust()Ljava/util/List;", cancellable = true)
    private void untrust__1434575481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434575481L))
            info.setReturnValue(null);
    }


}
