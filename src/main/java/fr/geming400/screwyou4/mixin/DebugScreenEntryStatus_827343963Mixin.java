package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugScreenEntryStatus.class)
public class DebugScreenEntryStatus_827343963Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;", cancellable = true)
    private static void values__1389171583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389171583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/debug/DebugScreenEntryStatus;", cancellable = true)
    private static void valueOf_1792522824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792522824L))
            info.setReturnValue(net.minecraft.client.gui.components.debug.DebugScreenEntryStatus.IN_OVERLAY);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_915552584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915552584L))
            info.setReturnValue("tf\uAD84:6d%\u1F60\uA88E\u756B\u54E8\uCD13h\uC27Efrh2ibR]_TS5V(`\u80E40\u40C7\uCECFu\uCEDD\uB706u_X\uCE85{(94cvTC\u25F1A\u38797F[\u3B2Cx6%J\"\u25A111_z\uFB6DuZ|*,X/c");
    }


}
