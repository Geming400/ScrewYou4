package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ProfiledReloadInstance.State.class)
public class State_139886164Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_949153319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949153319L))
            info.setReturnValue("/)V\uA8EDV\uB0C5 GEr[@[k{\u930A)Q+\uC448e;\u890A/kkonJReNB.\u8C965wE5:vt*4#`(\u269Exg{BFb;d_'lPKSFgUyw\uCF96z$7O/");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__768740105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768740105L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_910309688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910309688L))
            info.setReturnValue(",`)z\u8212\"V:nf\u3AF7m!#f/43`F5ZG`bF\uC524Tb`\u441DuW@sx08Cz,[+rq`T8<6,j|SpTG:[W}4)MD0\u1C3B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_697238254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697238254L))
            info.setReturnValue(-1519543091);
    }

    @Inject(at = @At("HEAD"), method = "reloadCount()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void reloadCount_1155300516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1155300516L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }

    @Inject(at = @At("HEAD"), method = "preparationNanos()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void preparationNanos__1572688234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572688234L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }

    @Inject(at = @At("HEAD"), method = "preparationCount()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void preparationCount__403821722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403821722L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }

    @Inject(at = @At("HEAD"), method = "reloadNanos()Ljava/util/concurrent/atomic/AtomicLong;", cancellable = true)
    private void reloadNanos__13565996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13565996L))
            info.setReturnValue(new java.util.concurrent.atomic.AtomicLong());
    }


}
