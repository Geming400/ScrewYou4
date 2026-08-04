package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.tags.TagNetworkSerialization.class)
public class TagNetworkSerialization_176971378Mixin {
        @Inject(at = @At("HEAD"), method = "serializeTagsToNetwork(Lnet/minecraft/core/LayeredRegistryAccess;)Ljava/util/Map;", cancellable = true)
    private static void serializeTagsToNetwork_760082379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760082379L))
            info.setReturnValue(null);
    }


}
