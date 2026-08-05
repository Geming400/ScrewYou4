package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.StructureMode.class)
public class StructureMode2144931256Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private static void values_1306079711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306079711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/StructureMode;", cancellable = true)
    private static void valueOf__1407924890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407924890L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.StructureMode.DATA);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__969623870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969623870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__2061827418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061827418L))
            info.setReturnValue("|J-$C/>'kje+e:$Eu(buCfP47&`4*Hb|F1]\uC1FD]>?\u6585?w{1., &`kOBn5^6q*\uA9A5T%\"%M/Nwn\u96DA^)\u109E|\u875D3Z\uAD31i]79\u05EAZ\u39A89w$$S]\u619DaAd");
    }


}
