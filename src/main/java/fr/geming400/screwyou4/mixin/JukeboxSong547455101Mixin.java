package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.JukeboxSong.class)
public class JukeboxSong547455101Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__361171167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361171167L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1317878626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317878626L))
            info.setReturnValue(">B@,\u7D8B1l\"\u2992Y]\u46B0Uefkw{=/J;=2c\u68BCBeTr@VezaQ{^aZl\"l8xB`7IZcSB[Qtc8ni01O6a2o]jP_`t\u2688z\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1104807192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104807192L))
            info.setReturnValue(-460460923);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description_233523724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233523724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent_1852560462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852560462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "comparatorOutput()I", cancellable = true)
    private void comparatorOutput_1867501388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1867501388L))
            info.setReturnValue(834301384);
    }

    @Inject(at = @At("HEAD"), method = "fromStack(Lnet/minecraft/world/item/ItemStack;)Ljava/util/Optional;", cancellable = true)
    private static void fromStack_8130780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8130780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lengthInSeconds()F", cancellable = true)
    private void lengthInSeconds__1777695156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777695156L))
            info.setReturnValue(6.68252E7F);
    }

    @Inject(at = @At("HEAD"), method = "hasFinished(J)Z", cancellable = true)
    private void hasFinished__1728546214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1728546214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "lengthInTicks()I", cancellable = true)
    private void lengthInTicks_1707897528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707897528L))
            info.setReturnValue(-674330398);
    }


}
