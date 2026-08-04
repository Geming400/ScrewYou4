package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugScreenEntries.class)
public class DebugScreenEntries_1698714079Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/gui/components/debug/DebugScreenEntry;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void register_898338442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898338442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntry(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/gui/components/debug/DebugScreenEntry;", cancellable = true)
    private static void getEntry__1186345992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1186345992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allEntries()Ljava/util/Map;", cancellable = true)
    private static void allEntries__305909314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-305909314L))
            info.setReturnValue(null);
    }


}
