package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BambooLeaves.class)
public class BambooLeaves_834831140Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__300629332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300629332L))
            info.setReturnValue("s?@LmUO`fkbqK tyhB|䒚y瘱3iS6pi.^PRQ6eEL#1MjPL\"I*5s}z>'3hsbd`Wgj[v|S,⊃\"郖D{p");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BambooLeaves;", cancellable = true)
    private static void values__1369261290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369261290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BambooLeaves;", cancellable = true)
    private static void valueOf__1803353863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803353863L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BambooLeaves.SMALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__300629332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300629332L))
            info.setReturnValue("s?@LmUO`fkbqK tyhB|䒚y瘱3iS6pi.^PRQ6eEL#1MjPL\"I*5s}z>'3hsbd`Wgj[v|S,⊃\"郖D{p");
    }


}
