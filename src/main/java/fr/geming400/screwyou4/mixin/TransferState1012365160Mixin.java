package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.TransferState.class)
public class TransferState1012365160Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_103738892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103738892L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1782788685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1782788685L))
            info.setReturnValue("_u\u6402kVQFapvJX*3N\uD7D9r.J\uCCE9[aJgUMLDvY5-&JLI(5O`;(X\u39C0\u486F[g*;c4z!Zv\uCF90h\u17E0?bWlpze)1)7\u6A78*qe;r|(\u4261KGgGsu>C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1569717251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569717251L))
            info.setReturnValue(-1068234047);
    }

    @Inject(at = @At("HEAD"), method = "cookies()Ljava/util/Map;", cancellable = true)
    private void cookies_1193644897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193644897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seenInsecureChatWarning()Z", cancellable = true)
    private void seenInsecureChatWarning_1652889874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1652889874L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "seenPlayers()Ljava/util/Map;", cancellable = true)
    private void seenPlayers__1524303303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524303303L))
            info.setReturnValue(null);
    }


}
