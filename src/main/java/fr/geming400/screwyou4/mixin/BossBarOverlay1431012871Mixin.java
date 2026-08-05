package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.BossEvent.BossBarOverlay.class)
public class BossBarOverlay1431012871Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__457834031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457834031L))
            info.setReturnValue("\uA152u&\u5329b \u1253A(luV\uB271As!EU:'?FkuEd#?|,6X^ry*[xC>u.Wm%ET$\u2B42}m'\u25E2D,* :(\u21ACz'j5nw-^@8\uB27B[");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/BossEvent$BossBarOverlay;", cancellable = true)
    private static void values__862014030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-862014030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/BossEvent$BossBarOverlay;", cancellable = true)
    private static void valueOf__1340543751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340543751L))
            info.setReturnValue(net.minecraft.world.BossEvent.BossBarOverlay.PROGRESS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1519221493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519221493L))
            info.setReturnValue("3\"7j\u7D19v%(6gi$tdDAK]#]Sz08(^.q}S[yi+ZkdjN\u5BEC2R IjkP\uD655WN{t\u36A6<>.ve?nYw&UK#l$]s[rl\u2DA4\u9828kN;g\uCBCA9U0P\uA5F4o%<K@");
    }


}
