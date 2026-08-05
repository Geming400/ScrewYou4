package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.OperatorService.OperatorDto.class)
public class OperatorDto1370617778Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1538837259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538837259L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_235157803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235157803L))
            info.setReturnValue("^Dꆁ(V`IBe&=b9V");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1408880520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408880520L))
            info.setReturnValue(1306902026);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/ServerOpListEntry;)Lnet/minecraft/server/jsonrpc/methods/OperatorService$OperatorDto;", cancellable = true)
    private static void from__2082349629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082349629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private void player_527932641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(527932641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "permissionLevel()Ljava/util/Optional;", cancellable = true)
    private void permissionLevel_1616079200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616079200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bypassesPlayerLimit()Ljava/util/Optional;", cancellable = true)
    private void bypassesPlayerLimit_1616079200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1616079200L))
            info.setReturnValue(null);
    }


}
