package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.DecodeFromFieldFailedProblem.class)
public class DecodeFromFieldFailedProblem1227842737Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_2037109893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037109893L))
            info.setReturnValue("\u5E3B\u6141RvJ0mJ\uA08DSg2\uA082]>'4\u92D0J\u3782}($a\u59FCvcwD(\uB673`8kQ}H1yz6mf\u00F0u{,[b4\uC4C9");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_319216469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(319216469L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1998266262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998266262L))
            info.setReturnValue("\u3BF9g@oO1RXrO&Wsqb]|kx*\u6510*gYhVT+\u903E^7)\u1EC8]dcZ\uBADFAKRKi2bus(\u0488%cLe0P\u040FXdZX\u191E\u8974wc5GJ\u7534C^u?qs;gD{p3XSAp@W<?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1785194828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785194828L))
            info.setReturnValue(-1487699075);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error__1258416556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1258416556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void tag_2127128068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127128068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_53855030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(53855030L))
            info.setReturnValue(":a;/p/\u704E_Kngn\uC08Cr\"");
    }


}
