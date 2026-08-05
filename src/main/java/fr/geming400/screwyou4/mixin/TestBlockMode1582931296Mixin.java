package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.TestBlockMode.class)
public class TestBlockMode1582931296Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private static void values__1801335103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801335103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private static void valueOf_1921664318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921664318L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.TestBlockMode.START);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__593977869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593977869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDetailedMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDetailedMessage__593977869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593977869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_447470825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447470825L))
            info.setReturnValue("aB\u121D^%jW(reO\uAECDPx\u58AA(\u2198u&m\u79B6*B]bjzp44\uBC62X.`\u1BF2-O?>#g9aF,j\uB847+\u7011K75nEK4o0Jg%{8");
    }


}
