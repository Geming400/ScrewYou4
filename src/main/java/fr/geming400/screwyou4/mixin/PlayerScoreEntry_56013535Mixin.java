package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.PlayerScoreEntry.class)
public class PlayerScoreEntry_56013535Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_2046309875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046309875L))
            info.setReturnValue(2044262618);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__852612734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852612734L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_826437059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826437059L))
            info.setReturnValue("l\u304F:@\u9B11= IL#t\uC170c21ZA\u0665l n'@|r[&|<|.?hTA*/k'\uD5C7e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_613365625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613365625L))
            info.setReturnValue(79783419);
    }

    @Inject(at = @At("HEAD"), method = "isHidden()Z", cancellable = true)
    private void isHidden_2044117409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044117409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner__1186362150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186362150L))
            info.setReturnValue("\u5EB6{_+\uC9C7; sd\uB250>8*XIc\u4F87d\u6475@u9O\u138C@\u2545({*@21\u9C7A_Sh\uADCCe\u972E]0I,qSYC\u7F67m\"1");
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void display_1693628851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693628851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatValue(Lnet/minecraft/network/chat/numbers/NumberFormat;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void formatValue_1534887667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534887667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormatOverride()Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormatOverride_164994127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(164994127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ownerName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void ownerName__1777644081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777644081L))
            info.setReturnValue(null);
    }


}
