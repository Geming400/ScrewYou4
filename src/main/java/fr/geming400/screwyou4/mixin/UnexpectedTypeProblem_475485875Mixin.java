package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.UnexpectedTypeProblem.class)
public class UnexpectedTypeProblem_475485875Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1284753030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284753030L))
            info.setReturnValue("w3/{]:]JPWd=(p*r'\u6A2CW+GYXc@o]7=@P+Q25{/V\uBC68[@Z2\u5E0Bm\u25B6.\u9EFDIEvIv/j{`v\u074Fn^?D\uD58F\"y(B &5;(`&D\uA014");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__433140394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433140394L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1245909399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245909399L))
            info.setReturnValue("&l/\uCD60?[8c^M?X^w/BN \"\uB2C0\u92FF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1032837965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1032837965L))
            info.setReturnValue(757947299);
    }

    @Inject(at = @At("HEAD"), method = "expected()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void expected_611137165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611137165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "actual()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void actual__2069497609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2069497609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__698501833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-698501833L))
            info.setReturnValue("\u980C\u8021%O\u235A7z\uC35EH3\uAE1FfOw+\u8483j^.BJN{\uBA5F2\u6FE4CsXs\u8092n}");
    }


}
