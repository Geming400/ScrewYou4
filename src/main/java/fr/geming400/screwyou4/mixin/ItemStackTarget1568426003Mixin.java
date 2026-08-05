package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.ItemStackTarget.class)
public class ItemStackTarget1568426003Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/storage/loot/LootContext$ItemStackTarget;", cancellable = true)
    private static void values__1162197090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162197090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/storage/loot/LootContext$ItemStackTarget;", cancellable = true)
    private static void valueOf__1570586715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570586715L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.LootContext.ItemStackTarget.TOOL);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1656634625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656634625L))
            info.setReturnValue("C<O)\u6BE3v\u95A4#\uC136W5anVQ.956v\uFC99\u8B88,YW39oqU+hm");
    }

    @Inject(at = @At("HEAD"), method = "contextParam()Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private void contextParam_1825313648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825313648L))
            info.setReturnValue(null);
    }


}
