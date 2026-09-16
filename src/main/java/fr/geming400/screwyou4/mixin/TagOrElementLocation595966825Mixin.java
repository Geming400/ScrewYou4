package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ExtraCodecs.TagOrElementLocation.class)
public class TagOrElementLocation595966825Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__312659443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-312659443L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1366389854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366389854L))
            info.setReturnValue("5$p\u7B25EpBAdYe\"\"_&,\u418Dh\u50D2tn:#07S4I%ih1N\u0C84^\u03A5O{-9G{\u3A4C\u2263&LCZD6\u856F1];qR{2\uD711(@x#f?S\uCE2DN!B|7j/$BSB+\u62D7Z#_V\u5D54o[5\u2D06");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1153318916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1153318916L))
            info.setReturnValue(1898171475);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1996811061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996811061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tag()Z", cancellable = true)
    private void tag__220872250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220872250L))
            info.setReturnValue(true);
    }


}
