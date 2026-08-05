package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.functions.StringTemplate.class)
public class StringTemplate713759963Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__194866305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194866305L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1484183488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484183488L))
            info.setReturnValue("<Z-BL:@py&$LdJS\u757F{,/}#I\u12B0]:`*i^tS\u93BE7t3h54\uD7B8^E\u7E52.\u418A\u5DDEr\u0F02B^\u52EEEpm|\uC328vZ>(`^v}q=Y@7J3\u30DBrH]%iJ%Q2y<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1271112054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271112054L))
            info.setReturnValue(402400467);
    }

    @Inject(at = @At("HEAD"), method = "segments()Ljava/util/List;", cancellable = true)
    private void segments_1218069163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218069163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromString(Ljava/lang/String;)Lnet/minecraft/commands/functions/StringTemplate;", cancellable = true)
    private static void fromString_1707994996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707994996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "variables()Ljava/util/List;", cancellable = true)
    private void variables__1257625854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257625854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidVariableName(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidVariableName__1310153157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1310153157L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "substitute(Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private void substitute_1171802861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171802861L))
            info.setReturnValue(")(C2e>&YCv\u57330.O\u59DB@J\u9514v@<iF\u8FD6_\uC3E58R\uD1D4@gh'|MT}koDj=%`\uFF6A\uFE2790qizJ\uC038km:0IxIq\uBB94\u3D29\uC7E3UczIpxXe`L");
    }


}
