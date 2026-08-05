package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.properties.BellAttachType.class)
public class BellAttachType_2038481170Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/state/properties/BellAttachType;", cancellable = true)
    private static void values__1376103660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376103660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/BellAttachType;", cancellable = true)
    private static void valueOf_389099629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389099629L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.BellAttachType.DOUBLE_WALL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2126689791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126689791L))
            info.setReturnValue("\uD260W\u6FA67\u0847d\uAB55{\u8223;V(JYbnzVFC9wYHF<3&xc*'*hOf\uD4DE@Rrl\u7AFDYG\uA2F0uRlaBPT\uCD9DW4b ,e#\u2ACA;a'0>\uA655Eg\u4940$!'%0yB\u75D9i<h");
    }


}
