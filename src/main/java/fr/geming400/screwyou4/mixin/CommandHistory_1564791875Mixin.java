package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.CommandHistory.class)
public class CommandHistory_1564791875Mixin {
        @Inject(at = @At("HEAD"), method = "history()Ljava/util/Collection;", cancellable = true)
    private void history__248856398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-248856398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCommand(Ljava/lang/String;)V", cancellable = true)
    private void addCommand__1577814273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1577814273L))
            info.cancel();
    }


}
