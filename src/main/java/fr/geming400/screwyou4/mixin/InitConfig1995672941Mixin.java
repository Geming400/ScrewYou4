package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.WorldLoader.InitConfig.class)
public class InitConfig1995672941Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__913782096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-913782096L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_860212966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860212966L))
            info.setReturnValue("㏐q1WH᧢A(8i:@壇D1nSX];R,z널%ⷈLp1HN^lJFG<XU+QLH۶!齹BOs?>[6TJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2033935683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2033935683L))
            info.setReturnValue(1520335854);
    }

    @Inject(at = @At("HEAD"), method = "functionCompilationPermissions()Lnet/minecraft/server/permissions/PermissionSet;", cancellable = true)
    private void functionCompilationPermissions_923113387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923113387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packConfig()Lnet/minecraft/server/WorldLoader$PackConfig;", cancellable = true)
    private void packConfig_336634527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336634527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "commandSelection()Lnet/minecraft/commands/Commands$CommandSelection;", cancellable = true)
    private void commandSelection_1780533937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780533937L))
            info.setReturnValue(net.minecraft.commands.Commands.CommandSelection.ALL);
    }


}
